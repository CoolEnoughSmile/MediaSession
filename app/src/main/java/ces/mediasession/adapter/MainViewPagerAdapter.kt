package ces.mediasession.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ces.mediasession.fragment.DynamicZone
import ces.mediasession.fragment.MeFragment
import ces.mediasession.fragment.MusicHallFragment
import ces.mediasession.fragment.RecommendFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var fragments: List<Fragment> =
        listOf(MusicHallFragment(), RecommendFragment(), DynamicZone(), MeFragment())

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.count()
    }


}