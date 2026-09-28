package com.sportybet.feature.debugscreen.impl.encrypt.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ae80;
import defpackage.b5d;
import defpackage.ce80;
import defpackage.cgo;
import defpackage.dma;
import defpackage.em5;
import defpackage.f4g;
import defpackage.f87;
import defpackage.fae;
import defpackage.fma;
import defpackage.gae0;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.jtf0;
import defpackage.kr10;
import defpackage.o1k;
import defpackage.okt;
import defpackage.pd80;
import defpackage.php;
import defpackage.pr0;
import defpackage.q6a0;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010%JL\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010%R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b7\u0010%R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b8\u0010%R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b9\u0010%¨\u0006="}, d2 = {"Lcom/sportybet/feature/debugscreen/impl/encrypt/data/EncryptedRequest;", "Landroid/os/Parcelable;", "", AnalyticsParam.EVENT_PARAM_ID, "startTime", "", "url", "method", "originalBody", "encryptedBody", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lce80;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lce80;)V", "self", "Lfma;", "output", "Lpd80;", "serialDesc", "", "write$Self$impl", "(Lcom/sportybet/feature/debugscreen/impl/encrypt/data/EncryptedRequest;Lfma;Lpd80;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportybet/feature/debugscreen/impl/encrypt/data/EncryptedRequest;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "getStartTime", "Ljava/lang/String;", "getUrl", "getMethod", "getOriginalBody", "getEncryptedBody", "Companion", "a", "b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EncryptedRequest implements Parcelable {
    private final String encryptedBody;
    private final long id;
    private final String method;
    private final String originalBody;
    private final long startTime;
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<EncryptedRequest> CREATOR = new c();
    public static final int $stable = 8;

    @fae
    public static final /* synthetic */ class a implements o1k<EncryptedRequest> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest", aVar, 6);
            kr10Var.j(AnalyticsParam.EVENT_PARAM_ID, true);
            kr10Var.j("startTime", false);
            kr10Var.j("url", false);
            kr10Var.j("method", false);
            kr10Var.j("originalBody", false);
            kr10Var.j("encryptedBody", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            okt oktVar = okt.a;
            gae0 gae0Var = gae0.a;
            return new php[]{oktVar, oktVar, gae0Var, gae0Var, gae0Var, gae0Var};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            int i = 0;
            long jR = 0;
            long jR2 = 0;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            String strJ4 = null;
            boolean z = true;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                switch (iV) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        jR = dmaVarC.r(pd80Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        jR2 = dmaVarC.r(pd80Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        strJ = dmaVarC.j(pd80Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        strJ2 = dmaVarC.j(pd80Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        strJ3 = dmaVarC.j(pd80Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        strJ4 = dmaVarC.j(pd80Var, 5);
                        i |= 32;
                        break;
                    default:
                        jtf0.a(iV);
                        return null;
                }
            }
            dmaVarC.b(pd80Var);
            return new EncryptedRequest(i, jR, jR2, strJ, strJ2, strJ3, strJ4, (ce80) null);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            EncryptedRequest encryptedRequest = (EncryptedRequest) obj;
            encryptedRequest.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            EncryptedRequest.write$Self$impl(encryptedRequest, fmaVarC, pd80Var);
            fmaVarC.b(pd80Var);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest$b, reason: from kotlin metadata */
    public static final class Companion {
        public final php<EncryptedRequest> serializer() {
            return a.a;
        }
    }

    public static final class c implements Parcelable.Creator<EncryptedRequest> {
        @Override // android.os.Parcelable.Creator
        public final EncryptedRequest createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new EncryptedRequest(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EncryptedRequest[] newArray(int i) {
            return new EncryptedRequest[i];
        }
    }

    public /* synthetic */ EncryptedRequest(int i, long j, long j2, String str, String str2, String str3, String str4, ce80 ce80Var) {
        if (62 != (i & 62)) {
            cgo.a(i, 62, a.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        this.startTime = j2;
        this.url = str;
        this.method = str2;
        this.originalBody = str3;
        this.encryptedBody = str4;
    }

    public static /* synthetic */ EncryptedRequest copy$default(EncryptedRequest encryptedRequest, long j, long j2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            j = encryptedRequest.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = encryptedRequest.startTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = encryptedRequest.url;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = encryptedRequest.method;
        }
        return encryptedRequest.copy(j3, j4, str5, str2, (i & 16) != 0 ? encryptedRequest.originalBody : str3, (i & 32) != 0 ? encryptedRequest.encryptedBody : str4);
    }

    public static final /* synthetic */ void write$Self$impl(EncryptedRequest self, fma output, pd80 serialDesc) {
        if (output.a(serialDesc) || self.id != 0) {
            output.f(serialDesc, 0, self.id);
        }
        output.f(serialDesc, 1, self.startTime);
        output.o(serialDesc, 2, self.url);
        output.o(serialDesc, 3, self.method);
        output.o(serialDesc, 4, self.originalBody);
        output.o(serialDesc, 5, self.encryptedBody);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOriginalBody() {
        return this.originalBody;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEncryptedBody() {
        return this.encryptedBody;
    }

    public final EncryptedRequest copy(long id, long startTime, String url, String method, String originalBody, String encryptedBody) {
        url.getClass();
        method.getClass();
        originalBody.getClass();
        encryptedBody.getClass();
        return new EncryptedRequest(id, startTime, url, method, originalBody, encryptedBody);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedRequest)) {
            return false;
        }
        EncryptedRequest encryptedRequest = (EncryptedRequest) other;
        return this.id == encryptedRequest.id && this.startTime == encryptedRequest.startTime && Intrinsics.g(this.url, encryptedRequest.url) && Intrinsics.g(this.method, encryptedRequest.method) && Intrinsics.g(this.originalBody, encryptedRequest.originalBody) && Intrinsics.g(this.encryptedBody, encryptedRequest.encryptedBody);
    }

    public final String getEncryptedBody() {
        return this.encryptedBody;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getOriginalBody() {
        return this.originalBody;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.encryptedBody.hashCode() + gmf0.a(gmf0.a(gmf0.a(f87.a(Long.hashCode(this.id) * 31, this.startTime, 31), 31, this.url), 31, this.method), 31, this.originalBody);
    }

    public String toString() {
        long j = this.id;
        long j2 = this.startTime;
        String str = this.url;
        String str2 = this.method;
        String str3 = this.originalBody;
        String str4 = this.encryptedBody;
        StringBuilder sbA = q6a0.a(j, "EncryptedRequest(id=", ", startTime=");
        em5.a(j2, ", url=", str, sbA);
        hxa.c(sbA, ", method=", str2, ", originalBody=", str3);
        return pr0.a(sbA, ", encryptedBody=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.id);
        dest.writeLong(this.startTime);
        dest.writeString(this.url);
        dest.writeString(this.method);
        dest.writeString(this.originalBody);
        dest.writeString(this.encryptedBody);
    }

    public EncryptedRequest(long j, long j2, String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.id = j;
        this.startTime = j2;
        this.url = str;
        this.method = str2;
        this.originalBody = str3;
        this.encryptedBody = str4;
    }

    public /* synthetic */ EncryptedRequest(long j, long j2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, str, str2, str3, str4);
    }
}
