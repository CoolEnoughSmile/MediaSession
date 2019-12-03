package ces.mediasession.activity

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.app.ActivityOptionsCompat
import androidx.viewpager.widget.ViewPager
import ces.mediasession.R
import ces.mediasession.adapter.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.music_hall -> {
                    mainViewPager.currentItem = 0
                    true
                }

                R.id.recommend -> {
                    mainViewPager.currentItem = 1
                    true
                }

                R.id.dynamic_zone -> {
                    mainViewPager.currentItem = 2
                    true
                }

                R.id.me -> {
                    mainViewPager.currentItem = 3
                    true
                }
            }
            false
        }

//        btn.setOnClickListener {
//            val intent = Intent(this,SecondActivity::class.java)
//            val transitionActivityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(this,controlLayout,"controlLayout")
//            startActivity(intent,transitionActivityOptions.toBundle())
//        }

        mainViewPager.adapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                bottomNavigationView.menu.getItem(position).isChecked = true
            }


        })
    }

}
