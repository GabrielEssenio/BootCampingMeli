select d.nome_depto, COUNT(*) as number_funcionario
from departamento d
GROUP BY d.nome_depto
HAVING number_funcionario > 5