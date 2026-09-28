package com.sporty.android.core.model.dateofbirth;

import defpackage.ae80;
import defpackage.ce80;
import defpackage.cgo;
import defpackage.fma;
import defpackage.pd80;
import defpackage.php;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ae80
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sporty/android/core/model/dateofbirth/DobVerificationRequest;", "", "", "nin", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lce80;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lce80;)V", "self", "Lfma;", "output", "Lpd80;", "serialDesc", "", "write$Self$model", "(Lcom/sporty/android/core/model/dateofbirth/DobVerificationRequest;Lfma;Lpd80;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/dateofbirth/DobVerificationRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNin", "getBirthDate", "Companion", "$serializer", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DobVerificationRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String birthDate;
    private final String nin;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/dateofbirth/DobVerificationRequest$Companion;", "", "<init>", "()V", "Lphp;", "Lcom/sporty/android/core/model/dateofbirth/DobVerificationRequest;", "serializer", "()Lphp;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final php<DobVerificationRequest> serializer() {
            return DobVerificationRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DobVerificationRequest(int i, String str, String str2, ce80 ce80Var) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, DobVerificationRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.nin = str;
        this.birthDate = str2;
    }

    public static /* synthetic */ DobVerificationRequest copy$default(DobVerificationRequest dobVerificationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dobVerificationRequest.nin;
        }
        if ((i & 2) != 0) {
            str2 = dobVerificationRequest.birthDate;
        }
        return dobVerificationRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$model(DobVerificationRequest self, fma output, pd80 serialDesc) {
        output.o(serialDesc, 0, self.nin);
        output.o(serialDesc, 1, self.birthDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNin() {
        return this.nin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    public final DobVerificationRequest copy(String nin, String birthDate) {
        nin.getClass();
        birthDate.getClass();
        return new DobVerificationRequest(nin, birthDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DobVerificationRequest)) {
            return false;
        }
        DobVerificationRequest dobVerificationRequest = (DobVerificationRequest) other;
        return Intrinsics.g(this.nin, dobVerificationRequest.nin) && Intrinsics.g(this.birthDate, dobVerificationRequest.birthDate);
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getNin() {
        return this.nin;
    }

    public int hashCode() {
        return this.birthDate.hashCode() + (this.nin.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("DobVerificationRequest(nin=", this.nin, ", birthDate=", this.birthDate, ")");
    }

    public DobVerificationRequest(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.nin = str;
        this.birthDate = str2;
    }
}
