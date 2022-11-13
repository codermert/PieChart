package com.codermert.piechart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //değişkenimizi grafik görünümü için tanımlıyoruz

        GraphView graphView = findViewById(R.id.idGraphView);

        PointsGraphSeries<DataPoint> series = new PointsGraphSeries<>(getDataPoint());

        graphView.addSeries(series);
        graphView.getViewport().setScrollable(true);
        graphView.getViewport().setScalable(true);
        graphView.getViewport().setScalableY(true);
        graphView.getViewport().setScrollableY(true);

        series.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series.setSize(12);
        series.setColor(R.color.purple_200);

    }

    private DataPoint[] getDataPoint() {

        // veri noktası için bir değişken oluştur

        DataPoint[] dataPoints = new DataPoint[]

                {

                        // aşağıdaki satıra yeni bir tane ekliyoruz


                        new DataPoint(0, 1),

                        new DataPoint(1, 2),

                        new DataPoint(2, 3),

                        new DataPoint(3, 5),

                        new DataPoint(4, 1),

                        new DataPoint(4, 3),

                        new DataPoint(5, 3),

                        new DataPoint(6, 2)

                };



        return dataPoints;

    }
}
