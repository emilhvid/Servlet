
package Client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConverAddress_QNAME = new QName("http://amazonconnection/", "ConverAddress");
    private final static QName _ConverAddressResponse_QNAME = new QName("http://amazonconnection/", "ConverAddressResponse");
    private final static QName _ConvertAddress_QNAME = new QName("http://amazonconnection/", "ConvertAddress");
    private final static QName _ConvertAddressResponse_QNAME = new QName("http://amazonconnection/", "ConvertAddressResponse");
    private final static QName _GetAdresses_QNAME = new QName("http://amazonconnection/", "getAdresses");
    private final static QName _GetAdressesResponse_QNAME = new QName("http://amazonconnection/", "getAdressesResponse");
    private final static QName _GetDistance_QNAME = new QName("http://amazonconnection/", "getDistance");
    private final static QName _GetDistanceResponse_QNAME = new QName("http://amazonconnection/", "getDistanceResponse");
    private final static QName _GetPrice_QNAME = new QName("http://amazonconnection/", "getPrice");
    private final static QName _GetPriceResponse_QNAME = new QName("http://amazonconnection/", "getPriceResponse");
    private final static QName _GetRoute_QNAME = new QName("http://amazonconnection/", "getRoute");
    private final static QName _GetRouteResponse_QNAME = new QName("http://amazonconnection/", "getRouteResponse");
    private final static QName _GetTimeAndDate_QNAME = new QName("http://amazonconnection/", "getTimeAndDate");
    private final static QName _GetTimeAndDateResponse_QNAME = new QName("http://amazonconnection/", "getTimeAndDateResponse");
    private final static QName _GetTravelTime_QNAME = new QName("http://amazonconnection/", "getTravelTime");
    private final static QName _GetTravelTimeResponse_QNAME = new QName("http://amazonconnection/", "getTravelTimeResponse");
    private final static QName _Login_QNAME = new QName("http://amazonconnection/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://amazonconnection/", "loginResponse");
    private final static QName _SayHello_QNAME = new QName("http://amazonconnection/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://amazonconnection/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConverAddress }
     * 
     */
    public ConverAddress createConverAddress() {
        return new ConverAddress();
    }

    /**
     * Create an instance of {@link ConverAddressResponse }
     * 
     */
    public ConverAddressResponse createConverAddressResponse() {
        return new ConverAddressResponse();
    }

    /**
     * Create an instance of {@link ConvertAddress }
     * 
     */
    public ConvertAddress createConvertAddress() {
        return new ConvertAddress();
    }

    /**
     * Create an instance of {@link ConvertAddressResponse }
     * 
     */
    public ConvertAddressResponse createConvertAddressResponse() {
        return new ConvertAddressResponse();
    }

    /**
     * Create an instance of {@link GetAdresses }
     * 
     */
    public GetAdresses createGetAdresses() {
        return new GetAdresses();
    }

    /**
     * Create an instance of {@link GetAdressesResponse }
     * 
     */
    public GetAdressesResponse createGetAdressesResponse() {
        return new GetAdressesResponse();
    }

    /**
     * Create an instance of {@link GetDistance }
     * 
     */
    public GetDistance createGetDistance() {
        return new GetDistance();
    }

    /**
     * Create an instance of {@link GetDistanceResponse }
     * 
     */
    public GetDistanceResponse createGetDistanceResponse() {
        return new GetDistanceResponse();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link GetRoute }
     * 
     */
    public GetRoute createGetRoute() {
        return new GetRoute();
    }

    /**
     * Create an instance of {@link GetRouteResponse }
     * 
     */
    public GetRouteResponse createGetRouteResponse() {
        return new GetRouteResponse();
    }

    /**
     * Create an instance of {@link GetTimeAndDate }
     * 
     */
    public GetTimeAndDate createGetTimeAndDate() {
        return new GetTimeAndDate();
    }

    /**
     * Create an instance of {@link GetTimeAndDateResponse }
     * 
     */
    public GetTimeAndDateResponse createGetTimeAndDateResponse() {
        return new GetTimeAndDateResponse();
    }

    /**
     * Create an instance of {@link GetTravelTime }
     * 
     */
    public GetTravelTime createGetTravelTime() {
        return new GetTravelTime();
    }

    /**
     * Create an instance of {@link GetTravelTimeResponse }
     * 
     */
    public GetTravelTimeResponse createGetTravelTimeResponse() {
        return new GetTravelTimeResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "ConverAddress")
    public JAXBElement<ConverAddress> createConverAddress(ConverAddress value) {
        return new JAXBElement<ConverAddress>(_ConverAddress_QNAME, ConverAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "ConverAddressResponse")
    public JAXBElement<ConverAddressResponse> createConverAddressResponse(ConverAddressResponse value) {
        return new JAXBElement<ConverAddressResponse>(_ConverAddressResponse_QNAME, ConverAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "ConvertAddress")
    public JAXBElement<ConvertAddress> createConvertAddress(ConvertAddress value) {
        return new JAXBElement<ConvertAddress>(_ConvertAddress_QNAME, ConvertAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "ConvertAddressResponse")
    public JAXBElement<ConvertAddressResponse> createConvertAddressResponse(ConvertAddressResponse value) {
        return new JAXBElement<ConvertAddressResponse>(_ConvertAddressResponse_QNAME, ConvertAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdresses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getAdresses")
    public JAXBElement<GetAdresses> createGetAdresses(GetAdresses value) {
        return new JAXBElement<GetAdresses>(_GetAdresses_QNAME, GetAdresses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdressesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getAdressesResponse")
    public JAXBElement<GetAdressesResponse> createGetAdressesResponse(GetAdressesResponse value) {
        return new JAXBElement<GetAdressesResponse>(_GetAdressesResponse_QNAME, GetAdressesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getDistance")
    public JAXBElement<GetDistance> createGetDistance(GetDistance value) {
        return new JAXBElement<GetDistance>(_GetDistance_QNAME, GetDistance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getDistanceResponse")
    public JAXBElement<GetDistanceResponse> createGetDistanceResponse(GetDistanceResponse value) {
        return new JAXBElement<GetDistanceResponse>(_GetDistanceResponse_QNAME, GetDistanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getPrice")
    public JAXBElement<GetPrice> createGetPrice(GetPrice value) {
        return new JAXBElement<GetPrice>(_GetPrice_QNAME, GetPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getPriceResponse")
    public JAXBElement<GetPriceResponse> createGetPriceResponse(GetPriceResponse value) {
        return new JAXBElement<GetPriceResponse>(_GetPriceResponse_QNAME, GetPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getRoute")
    public JAXBElement<GetRoute> createGetRoute(GetRoute value) {
        return new JAXBElement<GetRoute>(_GetRoute_QNAME, GetRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getRouteResponse")
    public JAXBElement<GetRouteResponse> createGetRouteResponse(GetRouteResponse value) {
        return new JAXBElement<GetRouteResponse>(_GetRouteResponse_QNAME, GetRouteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTimeAndDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getTimeAndDate")
    public JAXBElement<GetTimeAndDate> createGetTimeAndDate(GetTimeAndDate value) {
        return new JAXBElement<GetTimeAndDate>(_GetTimeAndDate_QNAME, GetTimeAndDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTimeAndDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getTimeAndDateResponse")
    public JAXBElement<GetTimeAndDateResponse> createGetTimeAndDateResponse(GetTimeAndDateResponse value) {
        return new JAXBElement<GetTimeAndDateResponse>(_GetTimeAndDateResponse_QNAME, GetTimeAndDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTravelTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getTravelTime")
    public JAXBElement<GetTravelTime> createGetTravelTime(GetTravelTime value) {
        return new JAXBElement<GetTravelTime>(_GetTravelTime_QNAME, GetTravelTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTravelTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "getTravelTimeResponse")
    public JAXBElement<GetTravelTimeResponse> createGetTravelTimeResponse(GetTravelTimeResponse value) {
        return new JAXBElement<GetTravelTimeResponse>(_GetTravelTimeResponse_QNAME, GetTravelTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amazonconnection/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
