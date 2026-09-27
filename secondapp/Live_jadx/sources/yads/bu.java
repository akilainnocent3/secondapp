package yads;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f147342a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f147343b = Charset.forName(CharEncoding.ISO_8859_1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f147344c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f147345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f147346e;

    static {
        Charset.forName(CharEncoding.UTF_16BE);
        f147345d = Charset.forName(CharEncoding.UTF_16LE);
        f147346e = Charset.forName("UTF-16");
    }
}
