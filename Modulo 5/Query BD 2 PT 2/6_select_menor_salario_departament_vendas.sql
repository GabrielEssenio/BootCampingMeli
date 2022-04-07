select f.* FROM funcionario f INNER JOIN departamento d
ON f.depto_nro = d. depto_nro
WHERE d.nome_depto = "Vendas"
ORDER BY f.salario DESC
LIMIT 1;