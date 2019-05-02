package plots;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class commit_graph extends ApplicationFrame {

    public commit_graph(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Day",
                "Commits",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        final String Montag = "MON";
        final String Dienstag = "TUE";
        final String Mittwoch = "WED";
        final String Donnerstag = "THU";
        final String Freitag = "FRI";
        final String Samstag = "SAT";
        final String Sonntag = "SON";
        final String Sebastian = "Sebi";

        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        int[] values = get_values.values();
        dataset.addValue(values[0], Montag, Sebastian);
        dataset.addValue(values[1], Dienstag, Sebastian);
        dataset.addValue(values[2], Mittwoch, Sebastian);
        dataset.addValue(values[3], Donnerstag, Sebastian);
        dataset.addValue(values[4], Freitag, Sebastian);
        dataset.addValue(values[5], Samstag, Sebastian);
        dataset.addValue(values[6], Sonntag, Sebastian);

        return dataset;
    }

    public static void main(String[] args) {
        commit_graph chart = new commit_graph("Commit Statistics",
                "When did I commit how often?");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }
}
