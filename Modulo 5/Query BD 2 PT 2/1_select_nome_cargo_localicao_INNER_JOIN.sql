select f.nome, f.cargo, d.localizacao
FROM funcionario f INNER JOIN departamento d
on f.depto_nro = d.depto_nro