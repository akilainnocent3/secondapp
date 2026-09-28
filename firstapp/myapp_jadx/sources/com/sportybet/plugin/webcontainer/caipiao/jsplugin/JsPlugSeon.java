package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSCallbackContext;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.k5b;
import defpackage.sc80;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPlugSeon;", "Lcom/sportybet/plugin/webcontainer/jsbridge/LDJSPlugin;", "Lsc80;", "sessionProvider", "Lv5b;", "applicationScope", "Lk5b;", "mainDispatcher", "<init>", "(Lsc80;Lv5b;Lk5b;)V", "", "realMethod", "Lcom/sportybet/plugin/webcontainer/jsbridge/JsBridgeParams;", "args", "Lcom/sportybet/plugin/webcontainer/jsbridge/LDJSCallbackContext;", "callbackContext", "", "execute", "(Ljava/lang/String;Lcom/sportybet/plugin/webcontainer/jsbridge/JsBridgeParams;Lcom/sportybet/plugin/webcontainer/jsbridge/LDJSCallbackContext;)Z", "getName", "()Ljava/lang/String;", "Lcom/sportybet/plugin/webcontainer/jsbridge/service/JSPluginService;", "jsPluginService", "", "addMappings", "(Lcom/sportybet/plugin/webcontainer/jsbridge/service/JSPluginService;)V", "Lsc80;", "Lv5b;", "Lk5b;", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class JsPlugSeon extends LDJSPlugin {
    public static final String GET_SESSION = "getSession";
    public static final String JS_API_NAME = "AFJsApi.getSeonSession";
    public static final String KEY_SESSION = "session";
    public static final String PLUGIN_NAME = "seon";
    private final v5b applicationScope;
    private final k5b mainDispatcher;
    private final sc80 sessionProvider;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPlugSeon$execute$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPlugSeon$execute$1", f = "JsPlugSeon.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        final /* synthetic */ LDJSCallbackContext $callbackContext;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ JsPlugSeon this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LDJSCallbackContext lDJSCallbackContext, JsPlugSeon jsPlugSeon, v1b<? super AnonymousClass1> v1bVar) {
            super(2, v1bVar);
            this.$callbackContext = lDJSCallbackContext;
            this.this$0 = jsPlugSeon;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callbackContext, this.this$0, v1bVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            y5b y5bVar = y5b.a;
            int i = this.label;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    JsPlugSeon jsPlugSeon = this.this$0;
                    zi50.a aVar = zi50.b;
                    sc80 sc80Var = jsPlugSeon.sessionProvider;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    sc80Var.getClass();
                    obj = null;
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                bVar = (String) obj;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object obj2 = (String) (bVar instanceof zi50.b ? null : bVar);
            JSONObject jSONObject = new JSONObject();
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            this.$callbackContext.success(jSONObject.put(JsPlugSeon.KEY_SESSION, obj2));
            return Unit.a;
        }
    }

    public JsPlugSeon(sc80 sc80Var, @ApplicationScope v5b v5bVar, @Dispatcher(sportyDispatcher = SportyDispatchers.Main) k5b k5bVar) {
        sc80Var.getClass();
        v5bVar.getClass();
        k5bVar.getClass();
        this.sessionProvider = sc80Var;
        this.applicationScope = v5bVar;
        this.mainDispatcher = k5bVar;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public void addMappings(JSPluginService jsPluginService) {
        jsPluginService.getClass();
        jsPluginService.addJsMapping(PLUGIN_NAME, GET_SESSION, JS_API_NAME, true, true);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public boolean execute(String realMethod, JsBridgeParams args, LDJSCallbackContext callbackContext) {
        realMethod.getClass();
        args.getClass();
        if (!realMethod.equals(GET_SESSION)) {
            return false;
        }
        if (callbackContext == null) {
            return true;
        }
        ej5.c(this.applicationScope, this.mainDispatcher, null, new AnonymousClass1(callbackContext, this, null), 2);
        return true;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public String getName() {
        return PLUGIN_NAME;
    }
}
