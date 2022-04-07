select ep.title, a.first_name, a.last_name
from episodes ep INNER JOIN actor_episode ac
on ep.id = ac.episode_id
INNER JOIN actors a
on a.id = ac.actor_id
