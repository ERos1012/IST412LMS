//package Controller;
//
//
//@RestController
//public class AuthenticatorController {
//
//    @Autowired
//    private UserService userService; // Inject your user service
//
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequest request) {
//        // Validate input
//        // Calculate password strength
//        int passwordStrength = calculatePasswordStrength(request.getPassword());
//
//        if (passwordStrength < MIN_STRENGTH_THRESHOLD) {
//            return ResponseEntity.badRequest().body("Weak password. Please choose a stronger one.");
//        }
//
//        // Create user record in the database
//        // Return success or error message
//    }
//
//    private int calculatePasswordStrength(String password) {
//        // Evaluate length, complexity, uniqueness, etc.
//        // Return a score (e.g., 0 to 100)
//    }
//
//    // Other methods: login, logout, password reset, etc.
//}
//
