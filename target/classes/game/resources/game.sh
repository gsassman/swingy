find . -name "*.java" > src.txt
javac -sourcepath . @src.txt
java game.Game HeroBank.txt