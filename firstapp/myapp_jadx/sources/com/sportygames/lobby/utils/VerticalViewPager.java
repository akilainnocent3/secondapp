package com.sportygames.lobby.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.twilio.voice.EventKeys;
import defpackage.loz;
import defpackage.pgf;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002,-B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010'\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0014R\"\u0010(\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010\u0018¨\u0006."}, d2 = {"Lcom/sportygames/lobby/utils/VerticalViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "scrollFactor", "", "setSwipeScrollDurationFactor", "(D)V", "setAutoScrollDurationFactor", "", "getDirection", "()I", EventKeys.DIRECTION_KEY, "setDirection", "(I)V", "", "isCycle", "setCycle", "(Z)V", "isBorderAnimation", "setBorderAnimation", "", "x0", "J", "getInterval", "()J", "setInterval", "(J)V", "interval", "A0", "I", "getSlideBorderMode", "setSlideBorderMode", "slideBorderMode", "isStopScrollWhenTouch", "Z", "()Z", "setStopScrollWhenTouch", "a", "b", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VerticalViewPager extends ViewPager {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public int slideBorderMode;
    public boolean B0;
    public double C0;
    public double D0;
    public a E0;
    public pgf F0;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public long interval;
    public int y0;
    public boolean z0;

    public static final class a extends Handler {
        public final WeakReference<VerticalViewPager> a;

        public a(VerticalViewPager verticalViewPager) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(verticalViewPager);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            VerticalViewPager verticalViewPager;
            pgf pgfVar;
            message.getClass();
            super.handleMessage(message);
            if (message.what != 0 || (verticalViewPager = this.a.get()) == null || (pgfVar = verticalViewPager.F0) == null) {
                return;
            }
            pgfVar.a = verticalViewPager.C0;
            loz adapter = verticalViewPager.getAdapter();
            int currentItem = verticalViewPager.getCurrentItem();
            int iC = adapter != null ? adapter.c() : -100;
            if (adapter != null && iC > 1) {
                if (verticalViewPager.y0 != 0) {
                    currentItem++;
                }
                if (currentItem < 0) {
                    if (verticalViewPager.z0) {
                        verticalViewPager.setCurrentItem(iC - 1, verticalViewPager.B0);
                    }
                } else if (currentItem != iC) {
                    verticalViewPager.setCurrentItem(currentItem, true);
                } else if (verticalViewPager.z0) {
                    verticalViewPager.setCurrentItem(0, verticalViewPager.B0);
                }
            }
            pgf pgfVar2 = verticalViewPager.F0;
            pgfVar2.getClass();
            pgfVar2.a = verticalViewPager.D0;
            long interval = verticalViewPager.getInterval();
            pgf pgfVar3 = verticalViewPager.F0;
            pgfVar3.getClass();
            long duration = interval + ((long) pgfVar3.getDuration());
            a aVar = verticalViewPager.E0;
            aVar.getClass();
            aVar.removeMessages(0);
            a aVar2 = verticalViewPager.E0;
            aVar2.getClass();
            aVar2.sendEmptyMessageDelayed(0, duration);
        }
    }

    public final class b implements ViewPager.j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public final void a(View view, float f) {
            if (f < -1.0f) {
                view.setAlpha(0.0f);
            } else {
                if (f > 1.0f) {
                    view.setAlpha(0.0f);
                    return;
                }
                view.setAlpha(1.0f);
                view.setTranslationX(view.getWidth() * (-f));
                view.setTranslationY(f * view.getHeight());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewPager(Context context) {
        super(context);
        context.getClass();
        this.interval = 1500L;
        this.y0 = 1;
        this.z0 = true;
        this.B0 = true;
        this.C0 = 1.0d;
        this.D0 = 1.0d;
        y();
    }

    public final int getDirection() {
        return this.y0 == 0 ? 0 : 1;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final int getSlideBorderMode() {
        return this.slideBorderMode;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        z(motionEvent);
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        z(motionEvent);
        return zOnInterceptTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        z(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void setAutoScrollDurationFactor(double scrollFactor) {
        this.C0 = scrollFactor;
    }

    public final void setBorderAnimation(boolean isBorderAnimation) {
        this.B0 = isBorderAnimation;
    }

    public final void setCycle(boolean isCycle) {
        this.z0 = isCycle;
    }

    public final void setDirection(int direction) {
        this.y0 = direction;
    }

    public final void setInterval(long j) {
        this.interval = j;
    }

    public final void setSlideBorderMode(int i) {
        this.slideBorderMode = i;
    }

    public final void setStopScrollWhenTouch(boolean z) {
    }

    public final void setSwipeScrollDurationFactor(double scrollFactor) {
        this.D0 = scrollFactor;
    }

    public final void y() {
        setPageTransformer(true, new b());
        setOverScrollMode(2);
        this.E0 = new a(this);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("y");
            declaredField.setAccessible(true);
            Field declaredField2 = ViewPager.class.getDeclaredField("v0");
            declaredField2.setAccessible(true);
            Context context = getContext();
            Object obj = declaredField2.get(null);
            obj.getClass();
            pgf pgfVar = new pgf(context, (Interpolator) obj);
            pgfVar.a = 1.0d;
            this.F0 = pgfVar;
            declaredField.set(this, pgfVar);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    public final void z(MotionEvent motionEvent) {
        float width = getWidth();
        float height = getHeight();
        motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.interval = 1500L;
        this.y0 = 1;
        this.z0 = true;
        this.B0 = true;
        this.C0 = 1.0d;
        this.D0 = 1.0d;
        y();
    }
}
