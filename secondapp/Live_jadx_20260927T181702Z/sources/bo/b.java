package bo;

import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f21828a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f21829b = 0.5d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21830c = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    public final boolean a(@l List<float[]> sensorData) {
        m0.p(sensorData, "sensorData");
        int size = sensorData.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (i10 == 0) {
                f10 = sensorData.get(i10)[0];
                f11 = sensorData.get(i10)[1];
                f12 = sensorData.get(i10)[2];
            } else {
                float f13 = sensorData.get(i10)[0] - f10;
                float f14 = sensorData.get(i10)[1] - f11;
                float f15 = sensorData.get(i10)[2] - f12;
                int i12 = f13 != 0.0f ? 0 : 1;
                if (f14 == 0.0f) {
                    i12++;
                }
                if (f15 == 0.0f) {
                    i12++;
                }
                if (i12 >= 2) {
                    i11++;
                }
            }
            i10++;
        }
        return ((double) i11) / ((double) sensorData.size()) >= 0.5d;
    }
}
