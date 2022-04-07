select ge.name, COUNT(*) as number_films
from genres ge INNER JOIN movies mo
on ge.id = mo.genre_id
GROUP BY ge.id
HAVING number_films >= 3