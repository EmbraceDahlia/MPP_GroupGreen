-- 6.7 List full details of all hotels.
SELECT * FROM Hotel;
-- 6.8 List full details of all hotels in London.
SELECT * FROM Hotel WHERE city='London';
-- 6.9 List the names and addresses of all guests living in London, alphabetically ordered by name.
SELECT guestName as `Name`,guestAddress as Address FROM Guest WHERE guestAddress LIKE '%London' ORDER BY guestName;
-- 6.10 List all double or family rooms with a price below £40.00 per night, in ascending order of price.
SELECT * FROM Room WHERE `type` IN ('double', 'family') AND price < 40 ORDER BY price;
-- 6.11 List the bookings for which no dateTo has been specified.
SELECT * from booking WHERE dateTo is null;
-- Aggregate functions
-- 6.12 How many hotels are there?
select count(*) as 'Number of Hotel' from hotel;
-- 6.13 What is the average price of a room?
select avg(price) as 'Average Price' from Room;
-- 6.14 What is the total revenue per night from all double rooms?
select sum(price) as 'Total Revenue per night' from Room where `type`='double';
-- 6.15 How many different guests have made bookings for August?
select count(distinct guestNo) from Booking where month(dateFrom)=8 or month(dateTo)=8;
-- Subqueries and joins
-- 6.16 List the price and type of all rooms at the Grosvenor Hotel.
SELECT Room.price, Room.type from Hotel
JOIN Room ON Room.hotelNo = Hotel.hotelNo
WHERE Hotel.hotelName = 'Grosvenor Hotel'
-- 6.17 List all guests currently staying at the Grosvenor Hotel.
select g.*
from Guest g
inner join Booking b on g.guestNo=b.guestNo
inner join Hotel h on b.hotelNo=h.hotelNo
where curdate() between b.dateFrom and b.dateTo and h.hotelName = 'Grosvenor Hotel';
-- 6.18 List the details of all rooms at the Grosvenor Hotel, including the name of the guest staying in the room, if
the room is occupied.
select r.*,g.guestName
from Room r
inner join Hotel h on r.hotelNo=h.hotelNo
left join Booking b on r.roomNo=b.roomNo and r.hotelNo=b.hotelNo AND curdate() between dateFrom and dateto
left join Guest g on b.guestNo=g.guestNo
where h.hotelName='Grosvenor Hotel';
-- 6.19 What is the total income from bookings for the Grosvenor Hotel today
select sum(price) as 'Total Income'
from Room r
inner join Booking b on r.roomNo=b.roomNo and r.hotelNo=b.hotelNo and curdate() between dateFrom and dateto
inner join Hotel h on b.hotelNo=h.hotelNo
where h.hotelName='Grosvenor Hotel';
