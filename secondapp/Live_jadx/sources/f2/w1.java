package f2;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class w1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f82620f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f82621g = 20;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f82622h = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f82623a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f82624b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f82625c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82626d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82627e = 0;

    public static float g(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    public void a(@NonNull MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f82626d != 0 && eventTime - this.f82624b[this.f82627e] > 40) {
            b();
        }
        int i10 = (this.f82627e + 1) % 20;
        this.f82627e = i10;
        int i11 = this.f82626d;
        if (i11 != 20) {
            this.f82626d = i11 + 1;
        }
        this.f82623a[i10] = motionEvent.getAxisValue(26);
        this.f82624b[this.f82627e] = eventTime;
    }

    public final void b() {
        this.f82626d = 0;
        this.f82625c = 0.0f;
    }

    public void c(int i10) {
        d(i10, Float.MAX_VALUE);
    }

    public void d(int i10, float f10) {
        float f11 = f() * i10;
        this.f82625c = f11;
        if (f11 < (-Math.abs(f10))) {
            this.f82625c = -Math.abs(f10);
        } else if (this.f82625c > Math.abs(f10)) {
            this.f82625c = Math.abs(f10);
        }
    }

    public float e(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f82625c;
    }

    public final float f() {
        long[] jArr;
        long j10;
        int i10 = this.f82626d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f82627e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f82624b[i11];
        while (true) {
            jArr = this.f82624b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f82626d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f82626d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            long j12 = jArr[i14];
            if (j10 == j12) {
                return 0.0f;
            }
            return this.f82623a[i14] / (j12 - j10);
        }
        float fAbs = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f82626d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f82624b;
            long j13 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j13) {
                i15++;
                float fG = g(fAbs);
                float f10 = this.f82623a[i18] / (this.f82624b[i18] - j13);
                fAbs += (f10 - fG) * Math.abs(f10);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return g(fAbs);
    }
}
