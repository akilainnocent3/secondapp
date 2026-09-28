package defpackage;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class kmy implements Callback {
    public final /* synthetic */ zom a;
    public final /* synthetic */ yom b;

    public class a implements xpm.a {
        public byte[] a;
        public final /* synthetic */ Response b;
        public final /* synthetic */ ResponseBody c;

        public a(Response response, ResponseBody responseBody) {
            this.b = response;
            this.c = responseBody;
        }

        @Override // xpm.a
        public final byte[] a() throws IOException {
            byte[] bArr = this.a;
            if (bArr != null) {
                return bArr;
            }
            byte[] bArrBytes = this.c.bytes();
            this.a = bArrBytes;
            return bArrBytes;
        }

        @Override // xpm.a
        public final int b() {
            return this.b.code();
        }

        @Override // xpm.a
        public final String c() {
            return this.b.message();
        }
    }

    public kmy(zom zomVar, yom yomVar) {
        this.a = zomVar;
        this.b = yomVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        this.a.accept(iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        ResponseBody responseBodyBody = response.body();
        try {
            this.b.accept(new a(response, responseBodyBody));
            if (responseBodyBody != null) {
                responseBodyBody.close();
            }
        } catch (Throwable th) {
            if (responseBodyBody != null) {
                try {
                    responseBodyBody.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
