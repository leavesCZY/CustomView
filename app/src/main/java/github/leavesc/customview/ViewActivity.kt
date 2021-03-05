package github.leavesc.customview

import android.content.Intent
import android.os.Bundle
import androidx.annotation.LayoutRes
import github.leavesc.customview.base.BaseActivity

class ViewActivity : BaseActivity() {

    companion object {

        private const val KEY_LAYOUT_ID = "keyLayoutId"

        fun navTo(activity: BaseActivity, @LayoutRes layoutId: Int) {
            val intent = Intent(activity, ViewActivity::class.java)
            intent.putExtra(KEY_LAYOUT_ID, layoutId)
            activity.startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(intent.getIntExtra(KEY_LAYOUT_ID, 0))
    }

}