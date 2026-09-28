package com.sportybet.android.account.international.data.model;

import com.sporty.android.core.model.patron.LoginResponse;
import defpackage.eal;
import defpackage.xdp;
import defpackage.zi50;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0017\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lxdp;", "Lcom/sporty/android/core/model/patron/LoginResponse;", "getAsLoginResponse", "(Lxdp;)Lcom/sporty/android/core/model/patron/LoginResponse;", "asLoginResponse", "Lcom/sportybet/android/account/international/data/model/RegistrationStatusResponse;", "getAsRegistrationStatusResponse", "(Lxdp;)Lcom/sportybet/android/account/international/data/model/RegistrationStatusResponse;", "asRegistrationStatusResponse", "Lcom/sportybet/android/account/international/data/model/INTCFPNumberResponse;", "getAsINTCpfNumberResponse", "(Lxdp;)Lcom/sportybet/android/account/international/data/model/INTCFPNumberResponse;", "asINTCpfNumberResponse", "africa-bet-android"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class INTRegisterKt {
    public static final INTCFPNumberResponse getAsINTCpfNumberResponse(xdp xdpVar) {
        Object bVar;
        xdpVar.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = (INTCFPNumberResponse) new eal().b(xdpVar, INTCFPNumberResponse.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (INTCFPNumberResponse) bVar;
    }

    public static final LoginResponse getAsLoginResponse(xdp xdpVar) {
        Object bVar;
        xdpVar.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = (LoginResponse) new eal().b(xdpVar, LoginResponse.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (LoginResponse) bVar;
    }

    public static final RegistrationStatusResponse getAsRegistrationStatusResponse(xdp xdpVar) {
        Object bVar;
        xdpVar.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = (RegistrationStatusResponse) new eal().b(xdpVar, RegistrationStatusResponse.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (RegistrationStatusResponse) bVar;
    }
}
