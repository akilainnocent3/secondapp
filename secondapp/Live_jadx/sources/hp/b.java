package hp;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class b implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f88492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnTouchListener f88493c;

    public b(a listener, View.OnTouchListener originOnTouchListener) {
        this.f88492b = listener;
        this.f88493c = originOnTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v10, MotionEvent event) {
        View.OnTouchListener onTouchListener = this.f88493c;
        boolean zOnTouch = onTouchListener != null ? onTouchListener.onTouch(v10, event) : false;
        a aVar = this.f88492b;
        if (aVar != null) {
            aVar.onTouch(v10, event);
        }
        return zOnTouch;
    }
}
