
import java.awt.*;
import javax.swing.*;

public class GrowthLoopUI extends JFrame {

    public GrowthLoopUI() {
        // عنوان النافذة
        setTitle("Growth Loop - Programming Roadmap");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // الألوان (أزرق فاتح، أزرق غامق، بنفسجي)
        Color darkBlue = new Color(15, 23, 42);      // أزرق غامق
        Color lightBlue = new Color(59, 130, 246);   // أزرق فاتح
        Color purple   = new Color(139, 92, 246);    // بنفسجي

        // شريط علوي (Header)
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(darkBlue);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        JLabel titleLabel = new JLabel("Growth Loop");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 28));

        JLabel subtitleLabel = new JLabel("AI-powered personalized programming roadmap for UoH students");
        subtitleLabel.setForeground(new Color(191, 219, 254));
        subtitleLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

        JPanel titlePanel = new JPanel();
        titlePanel.setOpaque(false);
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.add(titleLabel);
        titlePanel.add(Box.createVerticalStrut(5));
        titlePanel.add(subtitleLabel);

        JButton loginButton = new JButton("Log In");
        loginButton.setBackground(purple);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        loginButton.setBorder(BorderFactory.createEmptyBorder(8, 18, 8, 18));

        headerPanel.add(titlePanel, BorderLayout.WEST);
        headerPanel.add(loginButton, BorderLayout.EAST);

        // لوحة المحتوى الرئيسية (يسار: معلومات، يمين: نموذج بسيط)
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(new Color(15, 23, 42));

        // القسم الأيسر: مميزات Growth Loop
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(darkBlue);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JLabel featuresTitle = new JLabel("Why Growth Loop?");
        featuresTitle.setForeground(Color.WHITE);
        featuresTitle.setFont(new Font("SansSerif", Font.BOLD, 20));

        String[] features = {
                "• Clear, AI-generated learning roadmap",
                "• Matches your level, goals, and pace",
                "• Mix of free & paid curated courses",
                "• Volunteer instructors & alumni support",
                "• Focus on problem-solving, not memorization"
        };

        leftPanel.add(featuresTitle);
        leftPanel.add(Box.createVerticalStrut(15));

        for (String f : features) {
            JLabel lbl = new JLabel(f);
            lbl.setForeground(new Color(191, 219, 254));
            lbl.setFont(new Font("SansSerif", Font.PLAIN, 14));
            leftPanel.add(lbl);
            leftPanel.add(Box.createVerticalStrut(8));
        }

        // زر لبدء الخطة
        JButton startPlanButton = new JButton("Generate My Study Plan");
        startPlanButton.setBackground(lightBlue);
        startPlanButton.setForeground(Color.WHITE);
        startPlanButton.setFocusPainted(false);
        startPlanButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        startPlanButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        startPlanButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        leftPanel.add(Box.createVerticalStrut(20));
        leftPanel.add(startPlanButton);

        // القسم الأيمن: نموذج بسيط لبيانات الطالب
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(30, 41, 59));
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JLabel formTitle = new JLabel("Quick Profile");
        formTitle.setForeground(Color.WHITE);
        formTitle.setFont(new Font("SansSerif", Font.BOLD, 18));

        JLabel nameLabel = new JLabel("Name:");
        JLabel majorLabel = new JLabel("Major:");
        JLabel levelLabel = new JLabel("Current Programming Level:");
        JLabel goalLabel = new JLabel("Main Goal:");

        JTextField nameField = new JTextField();
        JTextField majorField = new JTextField();
        String[] levels = {"Beginner", "Intermediate", "Advanced"};
        JComboBox<String> levelCombo = new JComboBox<>(levels);
        JTextField goalField = new JTextField();

        nameLabel.setForeground(new Color(191, 219, 254));
        majorLabel.setForeground(new Color(191, 219, 254));
        levelLabel.setForeground(new Color(191, 219, 254));
        goalLabel.setForeground(new Color(191, 219, 254));

        Font labelFont = new Font("SansSerif", Font.PLAIN, 14);
        nameLabel.setFont(labelFont);
        majorLabel.setFont(labelFont);
        levelLabel.setFont(labelFont);
        goalLabel.setFont(labelFont);

        nameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        majorField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        levelCombo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        goalField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        JButton saveProfileButton = new JButton("Save Profile");
        saveProfileButton.setBackground(purple);
        saveProfileButton.setForeground(Color.WHITE);
        saveProfileButton.setFocusPainted(false);
        saveProfileButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        saveProfileButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        saveProfileButton.setBorder(BorderFactory.createEmptyBorder(8, 18, 8, 18));

        rightPanel.add(formTitle);
        rightPanel.add(Box.createVerticalStrut(15));

        rightPanel.add(nameLabel);
        rightPanel.add(nameField);
        rightPanel.add(Box.createVerticalStrut(10));

        rightPanel.add(majorLabel);
        rightPanel.add(majorField);
        rightPanel.add(Box.createVerticalStrut(10));

        rightPanel.add(levelLabel);
        rightPanel.add(levelCombo);
        rightPanel.add(Box.createVerticalStrut(10));

        rightPanel.add(goalLabel);
        rightPanel.add(goalField);
        rightPanel.add(Box.createVerticalStrut(20));

        rightPanel.add(saveProfileButton);

        // إضافة اللوحات الرئيسية
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        // شريط سفلي (Footer بسيط)
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(darkBlue);
        footerPanel.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));
        JLabel footerLabel = new JLabel("© 2026 Growth Loop - University of Ha'il");
        footerLabel.setForeground(new Color(148, 163, 184));
        footerLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        footerPanel.add(footerLabel);

        // إضافة كل شيء للإطار
        add(headerPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // استخدام مظهر النظام
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // تجاهل الخطأ ونستخدم المظهر الافتراضي
        }

        SwingUtilities.invokeLater(() -> {
            GrowthLoopUI ui = new GrowthLoopUI();
            ui.setVisible(true);
        });
    }
}


