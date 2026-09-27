package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes7.dex */
public class HeightScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f133470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f133471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f133472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f133473d;

    public interface a {
        void a(int i10);
    }

    public HeightScrollView(Context context) {
        super(context);
        this.f133471b = true;
        this.f133473d = 0;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        View view = this.f133472c;
        if (view != null) {
            this.f133473d = view.getHeight() - i11;
        }
        a aVar = this.f133470a;
        if (aVar != null) {
            aVar.a(i11);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f133471b) {
            return false;
        }
        if (this.f133472c == null || y10 >= this.f133473d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBlankView(View view) {
        this.f133472c = view;
    }

    public void setOnScrollListener(a aVar) {
        this.f133470a = aVar;
    }

    public void setScrollEnable(boolean z10) {
        this.f133471b = z10;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f133471b = true;
        this.f133473d = 0;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f133471b = true;
        this.f133473d = 0;
    }
}
