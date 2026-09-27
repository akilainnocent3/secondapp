package com.cleveradssolutions.mediation.bidding;

import com.cleveradssolutions.mediation.core.t;
import com.cleveradssolutions.mediation.core.y;
import dr.o;
import dr.z0;
import org.json.JSONStringer;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@o(message = "Migrate to new mediation")
public interface c extends com.cleveradssolutions.mediation.core.d, com.cleveradssolutions.mediation.core.o, t, y {
    @l
    JSONStringer A0(boolean z10, @l JSONStringer jSONStringer);

    @l
    JSONStringer D0(@l JSONStringer jSONStringer);

    @l
    JSONStringer F0(int i10);

    @l
    JSONStringer K(@l JSONStringer jSONStringer, @l z0<String, ? extends Object>... z0VarArr);

    @l
    JSONStringer P(@l JSONStringer jSONStringer);

    @l
    JSONStringer W(@l JSONStringer jSONStringer);

    @l
    String X();

    @l
    f i();

    @l
    JSONStringer l(@l JSONStringer jSONStringer);

    @l
    String q0();

    @l
    JSONStringer s0(@l String str, @l String str2, @l JSONStringer jSONStringer);

    @l
    JSONStringer x(@l String str, @m String str2, @m String str3, @l JSONStringer jSONStringer);
}
