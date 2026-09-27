package zn;

import dr.z0;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final List<z0<String, String>> f162037a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l List<z0<String, String>> suspectDeviceProperties) {
            super(null);
            m0.p(suspectDeviceProperties, "suspectDeviceProperties");
            this.f162037a = suspectDeviceProperties;
        }

        @l
        public final List<z0<String, String>> a() {
            return this.f162037a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final List<float[]> f162038a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l List<float[]> suspectSensorValues) {
            super(null);
            m0.p(suspectSensorValues, "suspectSensorValues");
            this.f162038a = suspectSensorValues;
        }

        @l
        public final List<float[]> a() {
            return this.f162038a;
        }
    }

    public /* synthetic */ d(x xVar) {
        this();
    }

    public d() {
    }
}
