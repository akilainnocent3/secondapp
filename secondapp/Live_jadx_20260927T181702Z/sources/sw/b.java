package sw;

import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f135629b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ sr.a f135628s = sr.c.c(d());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f135612c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nErrorCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorCode.kt\nokhttp3/internal/http2/ErrorCode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final b a(int i10) {
            for (b bVar : b.values()) {
                if (bVar.h() == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public a() {
        }
    }

    b(int i10) {
        this.f135629b = i10;
    }

    @oy.l
    public static sr.a<b> g() {
        return f135628s;
    }

    public final int h() {
        return this.f135629b;
    }
}
