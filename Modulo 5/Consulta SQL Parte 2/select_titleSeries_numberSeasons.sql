select se.title, sea.number
from series se INNER JOIN seasons sea
on se.id = sea.serie_id