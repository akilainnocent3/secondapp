package com.sportygames.anTesting.presentation.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.anTesting.presentation.ui.ANTestingActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import defpackage.bmy;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.elf;
import defpackage.fq0;
import defpackage.g0;
import defpackage.h0;
import defpackage.h5e;
import defpackage.hb5;
import defpackage.jc;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.qlf;
import defpackage.s8i0;
import defpackage.t;
import defpackage.v8i0;
import defpackage.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportygames/anTesting/presentation/ui/ANTestingActivity;", "Lfq0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ANTestingActivity extends fq0 {
    public static final /* synthetic */ int e = 0;
    public jc a;
    public g0 b;
    public CampaignParticipateV2 c;
    public final y d = y.d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        elf.b(this, null, 3);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_antesting, (ViewGroup) null, false);
        int i = R.id.btn_get_campaign_info;
        Button button = (Button) h5e.a(R.id.btn_get_campaign_info, viewInflate);
        if (button != null) {
            i = R.id.btn_send_conversion_data;
            Button button2 = (Button) h5e.a(R.id.btn_send_conversion_data, viewInflate);
            if (button2 != null) {
                i = R.id.btn_send_visitor_info;
                Button button3 = (Button) h5e.a(R.id.btn_send_visitor_info, viewInflate);
                if (button3 != null) {
                    i = R.id.campaign_data_view;
                    View viewA = h5e.a(R.id.campaign_data_view, viewInflate);
                    if (viewA != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.tv_cookies_data;
                        if (((TextView) h5e.a(R.id.tv_cookies_data, viewInflate)) != null) {
                            i = R.id.tv_show_campaign_data;
                            TextView textView = (TextView) h5e.a(R.id.tv_show_campaign_data, viewInflate);
                            if (textView != null) {
                                this.a = new jc(constraintLayout, button, button2, button3, viewA, textView);
                                setContentView(constraintLayout);
                                jc jcVar = this.a;
                                if (jcVar == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                ConstraintLayout constraintLayout2 = jcVar.a;
                                constraintLayout2.getClass();
                                qlf.b(constraintLayout2);
                                h0 h0Var = new h0();
                                v8i0 viewModelStore = getViewModelStore();
                                cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
                                viewModelStore.getClass();
                                defaultViewModelCreationExtras.getClass();
                                s8i0 s8i0Var = new s8i0(viewModelStore, h0Var, defaultViewModelCreationExtras);
                                dq7 dq7VarA = jq40.a(g0.class);
                                String strI = dq7VarA.i();
                                if (strI == null) {
                                    hb5.a("Local and anonymous classes can not be ViewModels");
                                    return;
                                }
                                this.b = (g0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                                jc jcVar2 = this.a;
                                if (jcVar2 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                jcVar2.b.setOnClickListener(new View.OnClickListener() { // from class: v
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ANTestingActivity aNTestingActivity = this.a;
                                        g0 g0Var = aNTestingActivity.b;
                                        if (g0Var == null) {
                                            Intrinsics.n("viewModel");
                                            throw null;
                                        }
                                        y yVar = aNTestingActivity.d;
                                        yVar.getClass();
                                        String strValueOf = String.valueOf(v56.a.get(yVar));
                                        g0Var.d.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
                                        ej5.c(o8i0.d(g0Var), null, null, new d0(g0Var, strValueOf, null), 3);
                                    }
                                });
                                jc jcVar3 = this.a;
                                if (jcVar3 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                jcVar3.d.setOnClickListener(new View.OnClickListener() { // from class: w
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ANTestingActivity aNTestingActivity = this.a;
                                        CampaignParticipateV2 campaignParticipateV2 = aNTestingActivity.c;
                                        if (campaignParticipateV2 == null) {
                                            Intrinsics.n("campaignParticipateV2");
                                            throw null;
                                        }
                                        if (!campaignParticipateV2.getCanConvert()) {
                                            jc jcVar4 = aNTestingActivity.a;
                                            if (jcVar4 != null) {
                                                jcVar4.f.setText(aNTestingActivity.getString(R.string.can_convert_is_false));
                                                return;
                                            } else {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                        }
                                        g0 g0Var = aNTestingActivity.b;
                                        if (g0Var == null) {
                                            Intrinsics.n("viewModel");
                                            throw null;
                                        }
                                        CampaignParticipateV2 campaignParticipateV3 = aNTestingActivity.c;
                                        if (campaignParticipateV3 == null) {
                                            Intrinsics.n("campaignParticipateV2");
                                            throw null;
                                        }
                                        int campaignId = campaignParticipateV3.getCampaignId();
                                        CampaignParticipateV2 campaignParticipateV4 = aNTestingActivity.c;
                                        if (campaignParticipateV4 == null) {
                                            Intrinsics.n("campaignParticipateV2");
                                            throw null;
                                        }
                                        int variantId = campaignParticipateV4.getVariantId();
                                        g0Var.e.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
                                        ej5.c(o8i0.d(g0Var), null, null, new f0(g0Var, campaignId, variantId, null), 3);
                                    }
                                });
                                jc jcVar4 = this.a;
                                if (jcVar4 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                jcVar4.c.setOnClickListener(new View.OnClickListener() { // from class: x
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ANTestingActivity aNTestingActivity = this.a;
                                        CampaignParticipateV2 campaignParticipateV2 = aNTestingActivity.c;
                                        if (campaignParticipateV2 == null) {
                                            Intrinsics.n("campaignParticipateV2");
                                            throw null;
                                        }
                                        if (!campaignParticipateV2.getCanConvert()) {
                                            jc jcVar5 = aNTestingActivity.a;
                                            if (jcVar5 != null) {
                                                jcVar5.f.setText(aNTestingActivity.getString(R.string.can_convert_is_false));
                                                return;
                                            } else {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                        }
                                        Map<y, String> map = v56.a;
                                        y yVar = aNTestingActivity.d;
                                        yVar.getClass();
                                        String strValueOf = String.valueOf(v56.a.get(yVar));
                                        g0 g0Var = aNTestingActivity.b;
                                        if (g0Var == null) {
                                            Intrinsics.n("viewModel");
                                            throw null;
                                        }
                                        CampaignParticipateV2 campaignParticipateV3 = aNTestingActivity.c;
                                        if (campaignParticipateV3 == null) {
                                            Intrinsics.n("campaignParticipateV2");
                                            throw null;
                                        }
                                        Integer numValueOf = Integer.valueOf(campaignParticipateV3.getCampaignId());
                                        CampaignParticipateV2 campaignParticipateV4 = aNTestingActivity.c;
                                        if (campaignParticipateV4 == null) {
                                            Intrinsics.n("campaignParticipateV2");
                                            throw null;
                                        }
                                        Integer numValueOf2 = Integer.valueOf(campaignParticipateV4.getVariantId());
                                        CampaignParticipateV2 campaignParticipateV5 = aNTestingActivity.c;
                                        if (campaignParticipateV5 == null) {
                                            Intrinsics.n("campaignParticipateV2");
                                            throw null;
                                        }
                                        String variantName = campaignParticipateV5.getVariantName();
                                        g0Var.f.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
                                        ej5.c(o8i0.d(g0Var), null, null, new e0(g0Var, numValueOf, strValueOf, numValueOf2, variantName, null), 3);
                                    }
                                });
                                g0 g0Var = this.b;
                                if (g0Var == null) {
                                    Intrinsics.n("viewModel");
                                    throw null;
                                }
                                g0Var.d.f(this, new lfy() { // from class: s
                                    @Override // defpackage.lfy
                                    public final void u1(Object obj) {
                                        int i2;
                                        LoadingState loadingState = (LoadingState) obj;
                                        int i3 = ANTestingActivity.e;
                                        int i4 = ANTestingActivity.a.a[loadingState.getStatus().ordinal()];
                                        if (i4 != 1) {
                                            ANTestingActivity aNTestingActivity = this.a;
                                            if (i4 != 2) {
                                                if (i4 != 3) {
                                                    uhc.a();
                                                    return;
                                                } else {
                                                    ResultWrapper.GenericError error = loadingState.getError();
                                                    Toast.makeText(aNTestingActivity, String.valueOf(error != null ? error.getCode() : null), 0).show();
                                                    return;
                                                }
                                            }
                                            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                                            CampaignParticipateV2 campaignParticipateV2 = hTTPResponse != null ? (CampaignParticipateV2) hTTPResponse.getData() : null;
                                            if (campaignParticipateV2 != null) {
                                                aNTestingActivity.c = campaignParticipateV2;
                                                jc jcVar5 = aNTestingActivity.a;
                                                if (jcVar5 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                jcVar5.f.setText(campaignParticipateV2.toString());
                                                jc jcVar6 = aNTestingActivity.a;
                                                if (jcVar6 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                jcVar6.d.setEnabled(true);
                                                String variantValue = campaignParticipateV2.getVariantValue();
                                                if (Intrinsics.g(variantValue, "0")) {
                                                    i2 = R.color.sh_seekbar;
                                                } else {
                                                    i2 = Intrinsics.g(variantValue, "1") ? R.color.sh_chip1 : R.color.sh_green;
                                                }
                                                jc jcVar7 = aNTestingActivity.a;
                                                if (jcVar7 != null) {
                                                    jcVar7.e.setBackgroundColor(aNTestingActivity.getColor(i2));
                                                } else {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                });
                                g0 g0Var2 = this.b;
                                if (g0Var2 == null) {
                                    Intrinsics.n("viewModel");
                                    throw null;
                                }
                                g0Var2.e.f(this, new t(this, 0));
                                g0 g0Var3 = this.b;
                                if (g0Var3 != null) {
                                    g0Var3.f.f(this, new lfy() { // from class: u
                                        @Override // defpackage.lfy
                                        public final void u1(Object obj) {
                                            String string;
                                            LoadingState loadingState = (LoadingState) obj;
                                            int i2 = ANTestingActivity.e;
                                            int i3 = ANTestingActivity.a.a[loadingState.getStatus().ordinal()];
                                            if (i3 != 1) {
                                                ANTestingActivity aNTestingActivity = this.a;
                                                if (i3 != 2) {
                                                    if (i3 != 3) {
                                                        uhc.a();
                                                        return;
                                                    } else {
                                                        ResultWrapper.GenericError error = loadingState.getError();
                                                        Toast.makeText(aNTestingActivity, String.valueOf(error != null ? error.getCode() : null), 0).show();
                                                        return;
                                                    }
                                                }
                                                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                                                jc jcVar5 = aNTestingActivity.a;
                                                if (jcVar5 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                TextView textView2 = jcVar5.f;
                                                if (hTTPResponse == null || (string = hTTPResponse.toString()) == null) {
                                                    string = aNTestingActivity.getString(R.string.conversion_success);
                                                    string.getClass();
                                                }
                                                textView2.setText(string);
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    Intrinsics.n("viewModel");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
