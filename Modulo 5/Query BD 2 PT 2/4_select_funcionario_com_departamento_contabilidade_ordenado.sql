select f.* from funcionario f INNER JOIN departamento d
ON f.dpto_nro = d.depto_nro
WHERE d.depto_nro = "D-000-1"
ORDER BY f.nome ASC;