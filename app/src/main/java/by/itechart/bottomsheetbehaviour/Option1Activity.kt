package by.itechart.bottomsheetbehaviour

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_option_1.*


class Option1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_1)

        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        var height: Int? = null
        var radius: Float? = null

        bottomSheetBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {}

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                if (height == null) height = peek.height
                if (radius == null) radius = cardView.radius
                peek.alpha = (1.0f - (slideOffset) * 2)
                icExpand.alpha = -(1.0f - (slideOffset) * 4)
                cardView.radius = radius!! * slideOffset
            }
        })
    }

}