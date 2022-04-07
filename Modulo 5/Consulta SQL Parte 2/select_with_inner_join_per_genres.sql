select se.title, ge.name as genres
from series se INNER JOIN genres ge
where se.genre_id = ge.id 