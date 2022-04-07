select f.nome, f.salario, d.nome_depto
FROM funcionario f INNER JOIN departamento d
on f.depto_nro = d.depto_nro
where f.cargo = "Presidente";