FOR /L %%i IN (1,1,1000) DO (
    java PrincipalAtomicInteger %%i >> GraficaAtomic.txt
)