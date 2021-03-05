package github.leavesc.customview.base

import android.app.Activity
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    private val tag = this::class.java.name

    protected fun <T : Activity> startActivity(clazz: Class<T>) {
        startActivity(Intent(this, clazz))
    }

    protected fun showToast(msg: Any) {
        Toast.makeText(this, msg.toString(), Toast.LENGTH_SHORT).show()
    }

    protected fun log(log: Any?) {
        Log.e(tag, log.toString())
    }

}