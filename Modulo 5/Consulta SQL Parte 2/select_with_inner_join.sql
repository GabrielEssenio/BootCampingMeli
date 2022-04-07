select mo.title, ge.name
from movies mo INNER JOIN genres ge
ON mo.genre_id = ge.id