package com.sportybet.ntespm.socket;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.sportybet.ntespm.socket.ReadDataHandler;
import com.sportybet.ntespm.socket.protobuf.SocketMessage;
import com.twilio.voice.EventKeys;
import defpackage.hp0;
import defpackage.uqm;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u000e*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0011"}, d2 = {"Lcom/sportybet/ntespm/socket/ReadDataHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "mainThreadHandler", "subscriberManager", "Lcom/sportybet/ntespm/socket/SubscriberManager;", "<init>", "(Landroid/os/Looper;Landroid/os/Handler;Lcom/sportybet/ntespm/socket/SubscriberManager;)V", "handleMessage", "", EventKeys.ERROR_MESSAGE, "Landroid/os/Message;", "removeLanguageSuffixFromMessage", "", "languageSocketSuffix", "Companion", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ReadDataHandler extends Handler {
    public static final int MESSAGE_READ_DATA = 2184;
    private Handler mainThreadHandler;
    private SubscriberManager subscriberManager;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDataHandler(Looper looper, Handler handler, SubscriberManager subscriberManager) {
        super(looper);
        looper.getClass();
        handler.getClass();
        subscriberManager.getClass();
        this.mainThreadHandler = handler;
        this.subscriberManager = subscriberManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleMessage$lambda$0(Collection collection, String str) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((Subscriber) it.next()).onReceive(str);
        }
    }

    private final String removeLanguageSuffixFromMessage(String str, String str2) {
        return str2 == null ? str : c.p(str, "^".concat(str2), "", false);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Topic groupTopic;
        uqm uqmVar;
        message.getClass();
        if (message.what == 2184) {
            try {
                Object obj = message.obj;
                obj.getClass();
                SocketMessage.RetMsg retMsg = (SocketMessage.RetMsg) obj;
                if (retMsg.hasBody() && retMsg.hasTopic()) {
                    int number = retMsg.getPushType().getNumber();
                    String languageSocketSuffix = null;
                    if (number == 1) {
                        groupTopic = new GroupTopic(retMsg.getTopic());
                    } else if (number != 2) {
                        groupTopic = number != 3 ? null : new MultiTopic(retMsg.getTopic(), "");
                    } else {
                        String topic = retMsg.getTopic();
                        topic.getClass();
                        groupTopic = new SpecialTopic(topic);
                    }
                    if (groupTopic == null) {
                        return;
                    }
                    hp0 hp0Var = hp0.A;
                    if (hp0Var != null && (uqmVar = hp0Var.b) != null) {
                        languageSocketSuffix = uqmVar.getLanguageSocketSuffix();
                    }
                    String stringUtf8 = retMsg.getBody().toStringUtf8();
                    stringUtf8.getClass();
                    final String strRemoveLanguageSuffixFromMessage = removeLanguageSuffixFromMessage(stringUtf8, languageSocketSuffix);
                    for (final Collection<Subscriber> collection : this.subscriberManager.getFlattenSubscriberSetOfTopic(groupTopic)) {
                        this.mainThreadHandler.post(new Runnable() { // from class: l340
                            @Override // java.lang.Runnable
                            public final void run() {
                                ReadDataHandler.handleMessage$lambda$0(collection, strRemoveLanguageSuffixFromMessage);
                            }
                        });
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
