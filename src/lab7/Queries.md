6.7) SELECT * FROM Hotel 
6.8) SELECT * FROM Hotel WHERE city = 'London'
6.9) SELECT guestName, guestAddress FROM Guest WHERE guestAddress LIKE('%London%') ORDER BY guestName
6.10) SELECT * FROM Room WHERE (type = 'Double' OR type = 'Family') AND price < 40 ORDER BY price 
6.11) SELECT * FROM Booking WHERE dateTo IS NULL
6.12) SELECT COUNT(*) FROM Hotel
6.13) SELECT AVG(price) FROM Room
6.14) SELECT SUM(price) FROM Room WHERE type = 'Double'
6.15) SELECT COUNT(DISTINCT guestNo) FROM Booking WHERE MONTH(dateFrom) = 8 OR MONTH(dateTo) = 8
6.16) 
SELECT Room.price, Room.type from Hotel 
JOIN Room ON Room.hotelNo = Hotel.hotelNo 
WHERE Hotel.hotelName = 'Grosvenor Hotel'
6.17)
SELECT Guest.* FROM Hotel
JOIN Booking ON Booking.hotelNo = Hotel.hotelNo
JOIN Guest ON Guest.guestNo = Booking.guestNo
WHERE Hotel.hotelName = 'Grosvenor Hotel' 
AND CURDATE() BETWEEN Booking.dateFrom AND Booking.dateTo
6.18)
SELECT Room.roomNo, Room.price, Room.type, Room.hotelNo, Guest.guestName FROM Room
JOIN Hotel ON Room.hotelNo = Hotel.hotelNo
LEFT JOIN Booking ON Booking.hotelNo = Hotel.hotelNo AND Booking.roomNo = Room.roomNo 
AND CURDATE() BETWEEN Booking.dateFrom AND Booking.dateTo
LEFT JOIN Guest ON Guest.guestNo = Booking.guestNo
WHERE Hotel.hotelName = 'Grosvenor Hotel'
6.19)
SELECT SUM(Room.price) as totalPrice FROM Hotel
JOIN Room ON Room.hotelNo = Hotel.hotelNo
JOIN Booking ON Booking.hotelNo = Hotel.hotelNo AND Booking.roomNo = Room.roomNo
WHERE Hotel.hotelName = 'Grosvenor Hotel' 
AND CURRENT_DATE BETWEEN Booking.dateFrom AND Booking.dateTo