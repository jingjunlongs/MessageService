docker build -t messageservice .
docker tag messageservice:latest jingjunlongsap/messageservice:latest
docker push jingjunlongsap/messageservice:latest