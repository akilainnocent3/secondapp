package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import defpackage.itf0;

/* JADX INFO: loaded from: classes4.dex */
public class ObservableScrollView extends NestedScrollView {
    public boolean V;
    public int W;
    public final Handler a0;

    public class a implements Handler.Callback {
        public int a = Integer.MIN_VALUE;

        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ObservableScrollView observableScrollView = ObservableScrollView.this;
            int scrollY = observableScrollView.getScrollY();
            String simpleName = a.class.getSimpleName();
            itf0.a aVar = itf0.a;
            aVar.q(simpleName);
            aVar.a("handleMessage, lastY = " + this.a + ", y = " + scrollY, new Object[0]);
            if (!observableScrollView.V && this.a == scrollY) {
                this.a = Integer.MIN_VALUE;
                observableScrollView.setScrollState(0);
                return true;
            }
            this.a = scrollY;
            Handler handler = observableScrollView.a0;
            handler.removeMessages(1);
            handler.sendEmptyMessageDelayed(1, 80L);
            return true;
        }
    }

    public interface b {
    }

    public ObservableScrollView(Context context) {
        super(context);
        this.V = false;
        this.W = 0;
        this.a0 = new Handler(Looper.getMainLooper(), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.W != i) {
            String simpleName = getClass().getSimpleName();
            itf0.a aVar = itf0.a;
            aVar.q(simpleName);
            aVar.a("---- onScrollStateChanged, state: %d --> %d", Integer.valueOf(this.W), Integer.valueOf(i));
            this.W = i;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            String simpleName = getClass().getSimpleName();
            itf0.a aVar = itf0.a;
            aVar.q(simpleName);
            aVar.a("handleEvent, action = %s", Integer.valueOf(motionEvent.getAction()));
            this.V = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        String simpleName = getClass().getSimpleName();
        itf0.a aVar = itf0.a;
        aVar.q(simpleName);
        aVar.a("onScrollChanged, isTouched = %s, l: %d --> %d, t: %d --> %d", Boolean.valueOf(this.V), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2));
        if (this.V) {
            setScrollState(1);
            return;
        }
        setScrollState(2);
        Handler handler = this.a0;
        handler.removeMessages(1);
        handler.sendEmptyMessageDelayed(1, 80L);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            String simpleName = getClass().getSimpleName();
            itf0.a aVar = itf0.a;
            aVar.q(simpleName);
            aVar.a("handleEvent, action = %s", Integer.valueOf(motionEvent.getAction()));
            this.V = false;
            Handler handler = this.a0;
            handler.removeMessages(1);
            handler.sendEmptyMessageDelayed(1, 80L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnScrollListener(b bVar) {
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = false;
        this.W = 0;
        this.a0 = new Handler(Looper.getMainLooper(), new a());
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V = false;
        this.W = 0;
        this.a0 = new Handler(Looper.getMainLooper(), new a());
    }
}
