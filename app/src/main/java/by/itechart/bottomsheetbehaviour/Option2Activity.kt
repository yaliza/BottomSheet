package by.itechart.bottomsheetbehaviour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_option_2.*

class Option2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option_2)

        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        bottomSheetBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {}

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                icExpand.alpha = -(1.0f - (slideOffset) * 4)
            }
        })
    }
}
