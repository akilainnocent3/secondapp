package com.inmobi.signals.adinfo;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.inmobi.media.Ui;
import com.inmobi.media.Vi;
import dr.w2;
import ds.p;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class SignalCollector {

    @l
    public static final Ui Companion = new Ui();

    @l
    private static final String TAG = "SignalCollector";

    @l
    private final AppLovinCommunicator communicator;

    @m
    private AppLovinCommunicatorSubscriber communicatorSubscriber;

    @l
    private final List<String> listOfTopics;

    public SignalCollector(@l List<String> listOfTopics) {
        m0.p(listOfTopics, "listOfTopics");
        this.listOfTopics = listOfTopics;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance();
        m0.o(appLovinCommunicator, "getInstance(...)");
        this.communicator = appLovinCommunicator;
    }

    private final AppLovinCommunicatorSubscriber createSubscriber(p<? super Bundle, ? super String, w2> pVar) {
        return new Vi(pVar);
    }

    @l
    public final List<String> getListOfTopics() {
        return this.listOfTopics;
    }

    public final void setupAppLovinCommunicator(@l p<? super Bundle, ? super String, w2> onEvent) {
        m0.p(onEvent, "onEvent");
        try {
            AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriberCreateSubscriber = createSubscriber(onEvent);
            this.communicatorSubscriber = appLovinCommunicatorSubscriberCreateSubscriber;
            this.communicator.subscribe(appLovinCommunicatorSubscriberCreateSubscriber, this.listOfTopics);
            Objects.toString(this.listOfTopics);
        } catch (Error | Exception unused) {
        }
    }
}
