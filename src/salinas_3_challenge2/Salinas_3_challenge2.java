/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salinas_3_challenge2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
 
public class Salinas_3_challenge2 extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(700, 550);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        GraphicsContext gc1 = canvas.getGraphicsContext2D();
        drawSky(gc,0,0,20000,20000);
        drawText(gc);
        drawHouseWalls(gc,260,260,200,200);
        drawDoor(gc,340,400,40,60);
        drawSun(gc,41); 
        drawWindow(gc1,280,300,40,40);
        drawWindow2(gc1,400,300,40,40);
        drawRoof(gc1);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawText(GraphicsContext gc) {
           gc.fillText("my drawing",100,10);
    
        
        
    }
    private void drawCircle(GraphicsContext gc,int x, int y, int d){
        gc.setFill(Color.YELLOW);
        gc.fillOval(x,y,d,d);
        
    }
    private void drawSun(GraphicsContext gc,int num){
        
            drawCircle(gc,25 ,25 ,100);
        
        
    }
    
    private void drawHouseWalls(GraphicsContext gc,int x,int y,int w, int h){
        gc.setFill(Color.RED);
        gc.fillRoundRect(x,y,w,h,10,10);
    }
    private void drawWindow(GraphicsContext gc1,int x,int y, int w,int h){
        gc1.setFill(Color.BLACK);
        //gc.fillPolygon(xPoints, yPoints, d);
        gc1.fillRoundRect(x,y,w,h,10,10);
        
       
    }
    private void drawWindow2(GraphicsContext gc1,int x,int y, int w,int h){
        gc1.setFill(Color.BLACK);
        //gc.fillPolygon(xPoints, yPoints, d);
        gc1.fillRoundRect(x,y,w,h,10,10);
        
       
    }
    private void drawDoor(GraphicsContext gc,int x,int y,int w, int h){
        gc.setFill(Color.BLACK);
        gc.fillRoundRect(x,y,w,h,10,10);
    }
    private void drawSky(GraphicsContext gc,int x,int y,int w, int h){
        gc.setFill(Color.SKYBLUE);
        gc.fillRoundRect(x,y,w,h,10,10);
    }
    private void drawRoof(GraphicsContext gc1){
        gc1.setFill(Color.BLACK);
        //gc.fillPolygon(xPoints, yPoints, d);
        gc1.fillPolygon(new double[]{260,310,460},
                 new double[]{260,100,260}, 3);
        
    }
    
}