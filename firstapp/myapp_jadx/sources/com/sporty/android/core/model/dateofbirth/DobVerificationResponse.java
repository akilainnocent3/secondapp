package com.sporty.android.core.model.dateofbirth;

import com.twilio.voice.EventKeys;
import defpackage.ae80;
import defpackage.ce80;
import defpackage.cgo;
import defpackage.fma;
import defpackage.pd80;
import defpackage.php;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ae80
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006("}, d2 = {"Lcom/sporty/android/core/model/dateofbirth/DobVerificationResponse;", "", "", "qualifiedForGift", "", EventKeys.ERROR_MESSAGE, "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lce80;", "serializationConstructorMarker", "(IZLjava/lang/String;Lce80;)V", "self", "Lfma;", "output", "Lpd80;", "serialDesc", "", "write$Self$model", "(Lcom/sporty/android/core/model/dateofbirth/DobVerificationResponse;Lfma;Lpd80;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/sporty/android/core/model/dateofbirth/DobVerificationResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getQualifiedForGift", "Ljava/lang/String;", "getMessage", "Companion", "$serializer", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DobVerificationResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String message;
    private final boolean qualifiedForGift;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/dateofbirth/DobVerificationResponse$Companion;", "", "<init>", "()V", "Lphp;", "Lcom/sporty/android/core/model/dateofbirth/DobVerificationResponse;", "serializer", "()Lphp;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final php<DobVerificationResponse> serializer() {
            return DobVerificationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DobVerificationResponse(int i, boolean z, String str, ce80 ce80Var) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, DobVerificationResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.qualifiedForGift = z;
        this.message = str;
    }

    public static /* synthetic */ DobVerificationResponse copy$default(DobVerificationResponse dobVerificationResponse, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dobVerificationResponse.qualifiedForGift;
        }
        if ((i & 2) != 0) {
            str = dobVerificationResponse.message;
        }
        return dobVerificationResponse.copy(z, str);
    }

    public static final /* synthetic */ void write$Self$model(DobVerificationResponse self, fma output, pd80 serialDesc) {
        output.i(serialDesc, 0, self.qualifiedForGift);
        output.o(serialDesc, 1, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getQualifiedForGift() {
        return this.qualifiedForGift;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final DobVerificationResponse copy(boolean qualifiedForGift, String message) {
        message.getClass();
        return new DobVerificationResponse(qualifiedForGift, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DobVerificationResponse)) {
            return false;
        }
        DobVerificationResponse dobVerificationResponse = (DobVerificationResponse) other;
        return this.qualifiedForGift == dobVerificationResponse.qualifiedForGift && Intrinsics.g(this.message, dobVerificationResponse.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getQualifiedForGift() {
        return this.qualifiedForGift;
    }

    public int hashCode() {
        return this.message.hashCode() + (Boolean.hashCode(this.qualifiedForGift) * 31);
    }

    public String toString() {
        return "DobVerificationResponse(qualifiedForGift=" + this.qualifiedForGift + ", message=" + this.message + ")";
    }

    public DobVerificationResponse(boolean z, String str) {
        str.getClass();
        this.qualifiedForGift = z;
        this.message = str;
    }
}
