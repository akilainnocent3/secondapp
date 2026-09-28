package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.List;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Response;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class amy implements bom<Interceptor.Chain, Response> {
    public static final amy a;
    public static final /* synthetic */ amy[] b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Protocol.values().length];
            a = iArr;
            try {
                iArr[Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Protocol.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Protocol.SPDY_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        amy amyVar = new amy("INSTANCE", 0);
        a = amyVar;
        b = new amy[]{amyVar};
    }

    public amy() {
        throw null;
    }

    public static amy valueOf(String str) {
        return (amy) Enum.valueOf(amy.class, str);
    }

    public static amy[] values() {
        return (amy[]) b.clone();
    }

    @Override // defpackage.bom
    public final String a(Interceptor.Chain chain) {
        return chain.request().url().getI();
    }

    @Override // defpackage.bom
    public final String c(Interceptor.Chain chain, Object obj) {
        Response response = (Response) obj;
        if (response == null) {
            return null;
        }
        int i = a.a[response.protocol().ordinal()];
        if (i == 1) {
            return "1.0";
        }
        if (i == 2) {
            return "1.1";
        }
        if (i == 3) {
            return "2";
        }
        if (i == 4) {
            return "3.1";
        }
        if ("H2_PRIOR_KNOWLEDGE".equals(response.protocol().name())) {
            return "2";
        }
        return null;
    }

    @Override // defpackage.bom
    public final String d(Interceptor.Chain chain, Object obj) {
        Response response = (Response) obj;
        if (response == null) {
            return null;
        }
        int i = a.a[response.protocol().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return "http";
        }
        if (i == 4) {
            return "spdy";
        }
        if ("H2_PRIOR_KNOWLEDGE".equals(response.protocol().name())) {
            return "http";
        }
        return null;
    }

    public final List e(Interceptor.Chain chain, String str) {
        return chain.request().headers(str);
    }

    public final String f(Interceptor.Chain chain) {
        return chain.request().method();
    }

    public final Integer h(Interceptor.Chain chain, Object obj) {
        return Integer.valueOf(((Response) obj).code());
    }

    public final InetSocketAddress i(Interceptor.Chain chain, Object obj) {
        Connection connection = chain.connection();
        if (connection == null) {
            return null;
        }
        SocketAddress remoteSocketAddress = connection.socket().getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            return (InetSocketAddress) remoteSocketAddress;
        }
        return null;
    }
}
