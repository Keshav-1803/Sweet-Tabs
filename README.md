# SweetTabs

SweetTabs is an Android application that demonstrates the use of **TabLayout** and **ViewPager2** to create a smooth tab-based user interface. This app features two tabs, each representing a different type of view: List View and Grid View. It uses **Material Design Components** to enhance the UI experience.

---

## Features

- **Tab-based Navigation**: Easily switch between List View and Grid View using tabs.  
- **Dynamic UI Updates**: Tabs are connected to the ViewPager2 for seamless navigation.  
- **Custom Icons**: Tabs are equipped with custom icons for better visual representation.  
- **Modern UI**: Built using **Material Design Components** for a clean and responsive layout.

---

## Screenshots

### Tab Layout Overview
- **List View** Tab: Displays items in a vertical list.  
- **Grid View** Tab: Displays items in a grid format.

### Icons in Tabs
- Each tab has its own distinctive icon, making the UI intuitive and user-friendly.

---

## How It Works

1. **TabLayout and ViewPager2 Integration**:  
   - The `TabLayout` provides the tabs, and `ViewPager2` handles the swiping behavior between them.
   
2. **Custom Adapter**:  
   - `ViewPagerAdapter` is used to connect individual tabs to their respective fragments.

3. **Tab Icons**:  
   - Each tab is initialized with its corresponding text and icon using the **TabLayoutMediator**.

4. **Fragments**:  
   - Each tab represents a fragment:
     - **List View Fragment**: Displays items in a list.  
     - **Grid View Fragment**: Displays items in a grid.

---

## Code Overview

### `MainActivity`

- Sets up the `TabLayout` and `ViewPager2`.
- Attaches the `TabLayoutMediator` to synchronize tabs with the `ViewPager2`.

#### Code Snippet
```kotlin
val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
val viewPager = findViewById<ViewPager2>(R.id.view_pager)

viewPager.adapter = ViewPagerAdapter(this)

val tabIcons = listOf(R.drawable.ic_list, R.drawable.ic_grid)

TabLayoutMediator(tabLayout, viewPager) { tab, position ->
    when (position) {
        0 -> {
            tab.text = "List View"
            tab.setIcon(tabIcons[0])
        }
        1 -> {
            tab.text = "Grid View"
            tab.setIcon(tabIcons[1])
        }
    }
}.attach()
```

### `ViewPagerAdapter`

The adapter handles the fragments corresponding to each tab.  
Each position represents:
- **Position 0**: List View  
- **Position 1**: Grid View  

---

## How to Run the App

1. Clone the repository or download the source code.
2. Open the project in **Android Studio**.
3. Sync the project with Gradle.
4. Build and run the app on an emulator or a physical device.

---

## Dependencies

This app uses the following dependencies:

```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.9.0'
    implementation 'androidx.recyclerview:recyclerview:1.3.0'
    implementation 'androidx.viewpager2:viewpager2:1.1.0'
}
```

---

## Customization

- **Adding More Tabs**:  
  Update the `ViewPagerAdapter` to include more fragments and modify the `TabLayoutMediator` logic to handle additional tabs.
  
- **Styling Tabs**:  
  Customize the appearance of the tabs by modifying the XML or using a custom `TabLayout` style.

---

## License

This project is licensed under the MIT License. Feel free to use, modify, and distribute the app as per the terms of the license.

---

If you have any questions or feedback, feel free to reach out! 🚀
