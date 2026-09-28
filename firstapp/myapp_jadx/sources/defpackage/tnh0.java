package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface tnh0 {
    public static final a a = new a();

    public class a implements tnh0 {
        @Override // defpackage.tnh0
        public final hoa a(b bVar, int i) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final /* synthetic */ b[] i;

        static {
            b bVar = new b("IMAGE_CAPTURE", 0);
            a = bVar;
            b bVar2 = new b("PREVIEW", 1);
            b = bVar2;
            b bVar3 = new b("IMAGE_ANALYSIS", 2);
            c = bVar3;
            b bVar4 = new b("VIDEO_CAPTURE", 3);
            d = bVar4;
            b bVar5 = new b("STREAM_SHARING", 4);
            e = bVar5;
            b bVar6 = new b("METERING_REPEATING", 5);
            f = bVar6;
            i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) i.clone();
        }
    }

    public interface c {
        pz5 a(Context context);
    }

    hoa a(b bVar, int i);
}
