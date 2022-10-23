import calculadora

def test_salario_dev():
    assert calculadora.calcula_salario('desenvolvedor', 2000.0) == 1800.0
    assert calculadora.calcula_salario('desenvolvedor', 2995.0) == 2695.5
    assert calculadora.calcula_salario('desenvolvedor', 3000.0) == 2400.0
    assert calculadora.calcula_salario('desenvolvedor', 10000.0) == 8000.0

def test_salario_dba():
    assert calculadora.calcula_salario('dba', 1000.0) == 850.0
    assert calculadora.calcula_salario('dba', 1995.0) == 1695.75
    assert calculadora.calcula_salario('dba', 2000.0) == 1500.0
    assert calculadora.calcula_salario('dba', 3000.0) == 2250.0

def test_salario_testador():
    assert calculadora.calcula_salario('testador', 1000.0) == 850.0
    assert calculadora.calcula_salario('testador', 1995.0) == 1695.75
    assert calculadora.calcula_salario('testador', 2000.0) == 1500.0
    assert calculadora.calcula_salario('testador', 3000.0) == 2250.0

def test_salario_gerente():
    assert calculadora.calcula_salario('gerente', 4000.0) == 3200.0
    assert calculadora.calcula_salario('gerente', 4995.0) == 3996.0
    assert calculadora.calcula_salario('gerente', 5000.0) == 3500.0
    assert calculadora.calcula_salario('gerente', 6000.0) == 4200.0