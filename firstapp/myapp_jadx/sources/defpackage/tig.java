package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.settings.SettingsActivity;
import com.sportybet.plugin.event.EventActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.SearchResultResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tig implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tig(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nx70 nx70Var;
        nx70 nx70Var2;
        String strValueOf;
        SearchResultResponse searchResultResponse;
        SearchResultResponse searchResultResponse2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) obj2;
                int i2 = EventActivity.U0;
                if (((qvu) obj) instanceof qvu.a) {
                    Intent intent = new Intent(eventActivity, (Class<?>) SettingsActivity.class);
                    intent.putExtra("destination_in_settings", "notification_settings_match_alert_route");
                    eventActivity.startActivity(intent);
                }
                return Unit.a;
            default:
                hv70 hv70Var = (hv70) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i3 = hv70.e.a[loadingState.getStatus().ordinal()];
                if (i3 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    ArrayList arrayListS0 = hv70.s0((hTTPResponse == null || (searchResultResponse2 = (SearchResultResponse) hTTPResponse.getData()) == null) ? null : searchResultResponse2.getData());
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    ArrayList arrayListS1 = hv70.s0((hTTPResponse2 == null || (searchResultResponse = (SearchResultResponse) hTTPResponse2.getData()) == null) ? null : searchResultResponse.getSuggestions());
                    hv70.d dVar = hv70Var.e;
                    if (dVar != null) {
                        int size = arrayListS0 != null ? arrayListS0.size() : 0;
                        int size2 = arrayListS1 != null ? arrayListS1.size() : 0;
                        xo80 xo80Var = dVar.a;
                        if (xo80Var != null) {
                            xo80Var.I.setVisibility(8);
                        }
                        xo80 xo80Var2 = dVar.a;
                        if (size > 0) {
                            if (xo80Var2 != null) {
                                xo80Var2.C.setVisibility(0);
                            }
                            xo80 xo80Var3 = dVar.a;
                            if (xo80Var3 != null) {
                                xo80Var3.z.setVisibility(8);
                            }
                            xo80 xo80Var4 = dVar.a;
                            if (xo80Var4 != null) {
                                TextView textView = xo80Var4.H;
                                Context context = dVar.b;
                                textView.setText(context != null ? context.getString(R.string.sg_search_found_text, String.valueOf(size)) : null);
                            }
                            HashMap map = new HashMap();
                            map.put("{count}", String.valueOf(size));
                            op5 op5Var = op5.a;
                            xo80 xo80Var5 = dVar.a;
                            op5.r(op5Var, b.f(xo80Var5 != null ? xo80Var5.H : null), map, 4);
                            xo80 xo80Var6 = dVar.a;
                            if (xo80Var6 != null) {
                                xo80Var6.E.setVisibility(8);
                            }
                            xo80 xo80Var7 = dVar.a;
                            if (xo80Var7 != null) {
                                xo80Var7.G.setVisibility(8);
                            }
                        } else {
                            if (xo80Var2 != null) {
                                xo80Var2.C.setVisibility(8);
                            }
                            xo80 xo80Var8 = dVar.a;
                            if (xo80Var8 != null) {
                                xo80Var8.z.setVisibility(8);
                            }
                            xo80 xo80Var9 = dVar.a;
                            if (xo80Var9 != null) {
                                xo80Var9.G.setVisibility(0);
                            }
                            xo80 xo80Var10 = dVar.a;
                            if (xo80Var10 != null) {
                                xo80Var10.y.setVisibility(8);
                            }
                            xo80 xo80Var11 = dVar.a;
                            if (xo80Var11 != null) {
                                xo80Var11.J.setVisibility(8);
                            }
                            xo80 xo80Var12 = dVar.a;
                            if (xo80Var12 != null) {
                                xo80Var12.E.setVisibility(8);
                            }
                        }
                        xo80 xo80Var13 = dVar.a;
                        if (xo80Var13 != null) {
                            xo80Var13.K.setVisibility(size2 > 0 ? 0 : 8);
                        }
                        xo80 xo80Var14 = dVar.a;
                        if (xo80Var14 != null) {
                            xo80Var14.D.setVisibility(size2 > 0 ? 0 : 8);
                        }
                    }
                    Context context2 = hv70Var.getContext();
                    if (context2 != null) {
                        int i4 = hv70Var.D ? -2 : 1;
                        hv70.a aVar = hv70Var.z;
                        r0t r0tVar = hv70Var.H;
                        List list = arrayListS0;
                        if (arrayListS0 == null) {
                            list = m2g.a;
                        }
                        nx70Var = new nx70(context2, i4, aVar, r0tVar, "SearchResult", list);
                    } else {
                        nx70Var = null;
                    }
                    hv70Var.c = nx70Var;
                    xo80 xo80Var15 = (xo80) hv70Var.b;
                    if (xo80Var15 != null) {
                        RecyclerView recyclerView = xo80Var15.F;
                        hv70Var.requireContext();
                        recyclerView.setLayoutManager(new GridLayoutManager(2));
                    }
                    xo80 xo80Var16 = (xo80) hv70Var.b;
                    if (xo80Var16 != null) {
                        xo80Var16.F.setAdapter(hv70Var.c);
                    }
                    Context context3 = hv70Var.getContext();
                    if (context3 != null) {
                        int i5 = hv70Var.D ? -2 : 1;
                        hv70.a aVar2 = hv70Var.A;
                        r0t r0tVar2 = hv70Var.H;
                        List list2 = arrayListS1;
                        if (arrayListS1 == null) {
                            list2 = m2g.a;
                        }
                        nx70Var2 = new nx70(context3, i5, aVar2, r0tVar2, "YouMayLikeResult", list2);
                    } else {
                        nx70Var2 = null;
                    }
                    hv70Var.d = nx70Var2;
                    xo80 xo80Var17 = (xo80) hv70Var.b;
                    if (xo80Var17 != null) {
                        RecyclerView recyclerView2 = xo80Var17.L;
                        hv70Var.requireContext();
                        recyclerView2.setLayoutManager(new GridLayoutManager(2));
                    }
                    xo80 xo80Var18 = (xo80) hv70Var.b;
                    if (xo80Var18 != null) {
                        xo80Var18.L.setAdapter(hv70Var.d);
                    }
                    hv70.d dVar2 = hv70Var.e;
                    if (dVar2 != null) {
                        xo80 xo80Var19 = dVar2.a;
                        strValueOf = String.valueOf(xo80Var19 != null ? xo80Var19.v.getText() : null);
                    } else {
                        strValueOf = "";
                    }
                    hv70Var.E = strValueOf;
                } else if (i3 == 2) {
                    hv70.d dVar3 = hv70Var.e;
                    if (dVar3 != null) {
                        xo80 xo80Var20 = dVar3.a;
                        if (xo80Var20 != null) {
                            xo80Var20.z.setVisibility(8);
                        }
                        xo80 xo80Var21 = dVar3.a;
                        if (xo80Var21 != null) {
                            xo80Var21.C.setVisibility(8);
                        }
                        xo80 xo80Var22 = dVar3.a;
                        if (xo80Var22 != null) {
                            xo80Var22.K.setVisibility(8);
                        }
                        xo80 xo80Var23 = dVar3.a;
                        if (xo80Var23 != null) {
                            xo80Var23.I.setVisibility(8);
                        }
                        xo80 xo80Var24 = dVar3.a;
                        if (xo80Var24 != null) {
                            xo80Var24.G.setVisibility(8);
                        }
                        xo80 xo80Var25 = dVar3.a;
                        if (xo80Var25 != null) {
                            xo80Var25.E.setVisibility(0);
                        }
                    }
                } else {
                    if (i3 != 3) {
                        uhc.a();
                        return null;
                    }
                    hv70.d dVar4 = hv70Var.e;
                    if (dVar4 != null) {
                        xo80 xo80Var26 = dVar4.a;
                        if (xo80Var26 != null) {
                            xo80Var26.z.setVisibility(8);
                        }
                        xo80 xo80Var27 = dVar4.a;
                        if (xo80Var27 != null) {
                            xo80Var27.C.setVisibility(8);
                        }
                        xo80 xo80Var28 = dVar4.a;
                        if (xo80Var28 != null) {
                            xo80Var28.K.setVisibility(8);
                        }
                        xo80 xo80Var29 = dVar4.a;
                        if (xo80Var29 != null) {
                            xo80Var29.E.setVisibility(8);
                        }
                        xo80 xo80Var30 = dVar4.a;
                        if (xo80Var30 != null) {
                            xo80Var30.G.setVisibility(8);
                        }
                        xo80 xo80Var31 = dVar4.a;
                        if (xo80Var31 != null) {
                            xo80Var31.I.setVisibility(0);
                        }
                    }
                }
                return Unit.a;
        }
    }
}
