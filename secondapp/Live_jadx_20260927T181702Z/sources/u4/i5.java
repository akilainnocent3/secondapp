package u4;

import android.util.Pair;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public interface i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i5 f138577a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements i5 {

        /* JADX INFO: renamed from: u4.i5$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1435a implements o1 {
            public C1435a() {
            }

            @Override // u4.o1
            public /* synthetic */ float a() {
                return n1.c(this);
            }

            @Override // u4.o1
            public /* synthetic */ Pair b() {
                return n1.d(this);
            }

            @Override // u4.o1
            public /* synthetic */ float c() {
                return n1.a(this);
            }

            @Override // u4.o1
            public /* synthetic */ Pair d() {
                return n1.b(this);
            }

            @Override // u4.o1
            public /* synthetic */ float e() {
                return n1.e(this);
            }

            @Override // u4.o1
            public /* synthetic */ Pair getScale() {
                return n1.f(this);
            }
        }

        @Override // u4.i5
        public x4.y0 a(List<x4.y0> list) {
            return list.get(0);
        }

        @Override // u4.i5
        public o1 b(int i10, long j10) {
            return new C1435a();
        }
    }

    x4.y0 a(List<x4.y0> list);

    o1 b(int i10, long j10);
}
