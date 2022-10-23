def calcula_salario(cargo, salario):
    if cargo == 'desenvolvedor':
        return salario * .9 if salario < 3000 else salario * .8