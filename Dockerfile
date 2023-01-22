FROM openjdk:8

WORKDIR /app

RUN apt update && \
    apt install -y build-essential maven && \
    wget https://go.dev/dl/go1.19.4.linux-amd64.tar.gz && \
    rm -rf /usr/local/go && tar -C /usr/local -xzf go1.19.4.linux-amd64.tar.gz
ENV PATH $PATH:/usr/local/go/bin

CMD ["sh", "run.sh"]