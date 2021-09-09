package com.sendyit.experiments;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.concurrent.TimeUnit;

@QuarkusMain
public class Main {

  public static void main(String[] args) throws InterruptedException {
    Quarkus.run(GrpcClient.class, args);
    TimeUnit.SECONDS.sleep(3);
    System.out.println("after sleep");
  }

  public static class GrpcClient implements QuarkusApplication {


    @Override
    public int run(String... args) throws Exception {
      Quarkus.waitForExit();
      return 0;
    }
  }
}
