def calcula_salario(cargo, salario):
    if cargo == 'desenvolvedor':
        return salario * .9 if salario < 3000 else salario * .8
    if cargo in ['dba', 'testador']:
        return salario * .85 if salario < 2000 else salario * .75
    