package f2;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f82295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f82296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnLongClickListener f82300f = new View.OnLongClickListener() { // from class: f2.b0
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f82290b.d(view);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnTouchListener f82301g = new View.OnTouchListener() { // from class: f2.c0
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f82292b.e(view, motionEvent);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        boolean a(@NonNull View view, @NonNull d0 d0Var);
    }

    public d0(@NonNull View view, @NonNull a aVar) {
        this.f82295a = view;
        this.f82296b = aVar;
    }

    public void a() {
        this.f82295a.setOnLongClickListener(this.f82300f);
        this.f82295a.setOnTouchListener(this.f82301g);
    }

    public void b() {
        this.f82295a.setOnLongClickListener(null);
        this.f82295a.setOnTouchListener(null);
    }

    public void c(@NonNull Point point) {
        point.set(this.f82297c, this.f82298d);
    }

    public boolean d(@NonNull View view) {
        if (this.f82299e) {
            return true;
        }
        boolean zA = this.f82296b.a(view, this);
        this.f82299e = zA;
        return zA;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    public boolean e(@NonNull View view, @NonNull MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f82297c = x10;
            this.f82298d = y10;
        } else if (action == 1) {
            this.f82299e = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f82299e = false;
            }
        } else if (v0.l(motionEvent, 8194) && (motionEvent.getButtonState() & 1) != 0 && !this.f82299e && (this.f82297c != x10 || this.f82298d != y10)) {
            this.f82297c = x10;
            this.f82298d = y10;
            boolean zA = this.f82296b.a(view, this);
            this.f82299e = zA;
            return zA;
        }
        return false;
    }
}
